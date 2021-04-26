import pprint
import sys

pp = pprint.PrettyPrinter(indent=4)


class Testowana:
    def __init__(self, driver):
        self.driver = driver

    def generate_help(self, key):
        if self.driver == "windows" or self.driver == "linux":
            pp.pprint(dictionary[self.driver][key])
            return dictionary[self.driver][key]

        else:
            print("Zly sterownik")

    def get_desc(self, key):
        if self.driver == "windows" or self.driver == "linux":
            keys = key.split(" ")
            try:
                pp.pprint(dictionary[self.driver][keys[0]].get(keys[1]))
            except:
                return sys.exc_info()[0]
            return dictionary[self.driver][keys[0]].get(keys[1])
        else:
            print("Zly sterownik")


dictionary = {
    'windows':
        {
            'cd':
                {
                    '/d': 'Changes the current drive as well as the current directory for a drive.',
                    '[..]': 'Specifies that you want to change to the parent folder.'
                },
            'color':
                {
                    '<b>': 'Specifies the background color.',
                    '<f>': 'Specifies the foreground color.'
                },
            'echo':
                {
                    'on': 'Turns on the command echoing feature. Command echoing is on by default.',
                    'off': 'Turns off the command echoing feature. Command echoing is on by default.'
                },
            'ping':
                {
                    '/t': 'Specifies ping continue sending echo Request messages to the destination until '
                          'interrupted. To interrupt and display statistics, press CTRL+ENTER. To interrupt and quit '
                          'this command, press CTRL+C.',
                    '/a': 'Specifies reverse name resolution be performed on the destination IP address. If this is '
                          'successful, ping displays the corresponding host name. ',
                    '/n': 'Specifies the number of echo Request messages be sent. The default is 4.'
                },
            'sort':
                {
                    '/r': 'Reverses the sort order (that is, sorts from Z to A and from 9 to 0).',
                    '/m': 'Specifies the amount of main memory to use for the sort in kilobytes (KB).',
                    '/l': 'Overrides the sort order of characters that are defined by the system default locale (that '
                          'is, the language and Country/Region selected during installation).',
                    '/rec': 'Specifies the maximum number of characters in a record or a line of the input file (the '
                            'default value is 4,096 and the maximum is 65,535). '
                }
        },
    'linux':
        {
            'ls':
                {
                    '-a': 'do not ignore entries starting with .',
                    '-b': 'print C-style escapes for nongraphic characters',
                    '-d': 'list directories themselves, not their contents',
                },
            'rm':
                {
                    '-f': 'ignore nonexistent files and arguments, never prompt',
                    '-i': 'prompt before every removal',
                    '-r': 'remove directories and their contents recursively'
                },
            'mkdir':
                {
                    '-m': 'set file mode (as in chmod), not a=rwx - umask',
                    '-p': 'no error if existing, make parent directories as needed',
                    '-v': 'print a message for each created directory'
                },
            'sleep':
                {
                    '--help': 'display this help and exit',
                    '--version': 'output version information and exit'
                },
            'kill':
                {
                    '-s': 'Specify the signal to be sent. The signal can be specified by using name or number. The '
                          'behavior of signals is explained in signal(7) manual page.',
                    '-l': 'List signal names. This option has optional argument, which will convert signal number to '
                          'signal name, or other way round.',
                    '-L': 'List signal names in a nice table.'
                }
        }
}